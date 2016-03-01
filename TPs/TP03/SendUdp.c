#include <stdio.h>
#include <stdlib.h>
#include <netinet/in.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <string.h>
#include <unistd.h>

void sender(const char * message){

    int sock;
    struct sockaddr_in saddr;
    
    saddr.sin_family=AF_INET;
    saddr.sin_port=htons(5001);
    saddr.sin_addr.s_addr=inet_addr("127.0.0.1");

 
    sock=socket(saddr.sin_family, SOCK_DGRAM, 0);
    if(sock<0){
        perror("sock");
        exit(EXIT_FAILURE);
    }
    if(sendto(sock, message,strlen(message)+1, 0,(struct sockaddr *)&saddr, sizeof(saddr) ) < 0){
        perror("erreur a l'envoie") ;
        exit(EXIT_FAILURE) ;
    }
    
    close(sock);
  
    
}

int main (int argc, char* argv[]) {
  
    if (argc < 2){
        return EXIT_FAILURE;
    }  
    
    sender(argv[1]);
  
    return EXIT_SUCCESS ;
}
