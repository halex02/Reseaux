#include <stdio.h>
#include <stdlib.h>
#include <netinet/in.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <string.h>

int sender(){
  int socket_server;
  socket_server=socket(AF_INET, SOCK_STREAM, 0);
  if(socket_server==-1){
    perror("socket_server");
    return -1;
    }
 
  
  return socket_server;
}

int main (int argc, char* argv[]) {
  
  if(argc < 2)
    exit(EXIT_FAILURE) ;

  int socket = sender() ;
 struct sockaddr_in saddr;
  saddr.sin_family=AF_INET;
  saddr.sin_port=5001;
  saddr.sin_addr.s_addr=inet_addr("127.0.0.1");
  if(sendto(socket, argv[1],strlen(argv[1])+1, 0,(struct sockaddr *)&saddr, sizeof(saddr) ) == (-1)){
    perror("erreur a l'envoie") ;
    exit(EXIT_FAILURE) ;
  }
  
  return EXIT_SUCCESS ;
}
