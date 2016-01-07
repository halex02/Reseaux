# Cours 1 : 5 Janvier 2016
^
# Introduction aux Réseaux :

Un réseau numérique permet l'échange de données entre des machines distantes. Ces données sont, si nécessaire, _relayées_ de liaison en liaison par les machines intermédiaires.

## Modalité d'échange de donnée :

* Echange de données en mode connecté (on sait si les infos sont reçues ou non) : exemple de l'appel téléphonique.
* Echange de données en mode non-connecté (aucune info sur le fait que les données soient reçues ou non) : exemple de la poste.

## Topologies des réseaux :
^
On peut diffuser de l'info soit de point à point, soit en diffusion (broadcast).  
Différents types de topologies :

* maillage complet : chaque machine est reliée à toutes les autres machines du réseau. On l'utilise surtout sur les clusters de calcul.
* modèle en étoile : on relie toutes les machines à une machine centrale qui relaie toutes les données. Simple à configurer, à maintenir. Architecture préféré de l'admin sys/rsx.
* modèle en boucle (simple ou double): chaque machine a un prédécesseur et un successeur.
* maillage irrégulier : modèle domestique le plus courant.

# Signaux et transmission de données :
^
Exemple du signal carré basique : Données transmises via un signal carré que le recepteur consulte à un intervalle régulier T (période du signal). 1 = 1, 0 = 0.

Quand on envoie un signal sur un cable de cuivre, on a une élévation de température (ie effet joule, ie. bruit), ce qui se traduit par une perte de certaines plages de fréquence dans le signal émis initialement.

Séries de Fourier.

