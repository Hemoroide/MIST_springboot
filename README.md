** UML **

﻿Vous trouverez l UML du projet dans le dossier MIST UML. Afin de pouvoir visualiser les mock-up ainsi que l'enchainement des pages, il faut telecharger le logiciel Balsamiq (https://balsamiq.com/), importer le fichier MOCK UP + SEQUENCE MIST.bmpr (selectionner project->import puis le fichier), puis faire "ctrl + F" pour démarrer la présentation interactive.

** CONFIGURATION REQUISE **

Installer un EDI de type Eclipse pour la partie back-end. Installer un EDI de type Visual Studio pour la partie front-end. Installer MYSQL JRE installer sur l'ordinateur (v 1.8), attention la v 1.9 est déconseillée https://www.java.com/fr/download/help/download_options.xml Balsamique

Creer deux dossier séparer, un front, un back puis :

GITBASH -> Cloner : https://github.com/Hemoroide/mist_springboot.git dans le dossier back, Cloner : https://github.com/Hemoroide/mist_angular.git dans le dossier front

** CONFIGURATION TECHNIQUE **

** INSTALLATION DE LA BASE DE DONNE **

Importer le fichier MIST.SQL dans votre outil de gestion de base de donnée (type PHPMYADMIN ou SQLWorkbench).

Modifier le fichier application.properties dans src/main/ressources si besoin pour modifier admin ou mot de passe.

** INSTALLATION DU BACK-END **

Ouvrir votre IDE eclipse

Selectionner File->import

Selectionner Importer un projet Maven existant

Choisir le dossier du projet, selectionner le POM.XML s'il n'est pas déjà coché et cliquer sur finish

Dans le package explorer faire un clic droit sur java-springboot-simplecrud puis "Run as" puis "Spring Boot App"

** INSTALLATION DU FRONT END **

Ouvrir votre IDE visual studio code.

Puis : fichier->ouvrir le dossier->selectionner le dossier MIST ANGULAR

Ouvrir le terminal de commande de l'IDE

Lancer la commande "NPM INSTALL" dans le terminal

Une fois l'installation du node module terminé, lancer la commande "NG SERVE" dans le terminal pour faire fonctionner le Front de l'application

** UTILISATION DE L'APPLICATION **

Une fois tout installer, ouvrir votre browser internet puis dans la barre d'adresse saisir :http://localhost:4200 (si votre port par defaut pour angular est 4200 sinon saisir le port utilisé)

La partie authentification ne fonctionnant pas pour le moment, cliquer sur VALIDER.

La partie pour ajouter une arme se trouve dans l'onglet GESTION. Cliquer ensuite sur le bouton ARME afin de pouvoir voir la liste ou ajouter une arme.

** POUR LES FORMATEURS **

J'ai devellopée la partie Arme du springBoot en me basant sur la restitution de Jean-Luc et Alexis qui se sont occupé du back-end. Ils ont décidé d'utiliser la technologie JPA avec laquelle je ne suis pas trés à l'aise, j'ai donc créé une autre petite appli personnel disponible à cette adresse : https://github.com/Hemoroide/AanodMerch . Il s'agit d'une appli de gestion de merchandising dans lequelle se trouve toutes les requêtes SQL en prepareStatement que vous pouvez évaluer.