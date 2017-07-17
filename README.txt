tigger-MANZAMBI

Réalisé par Anaël MANZAMBI et Cédric SADOUNE

Rapport de projet : "INF-4301A : Langages et compilation" 

I - Présentation
II - Installation et mode d'emploi
III - Fonctionnalités 
IV - Fonctionnement 
V - Problèmes rencontrés
VI - Idées d'amélioration

I - Présentation

Tigger est un dérivé d'un projet original nommé "Tiger". Il s'agit d'un projet à caractère scolaire afin d'apprendre le fonctionnement d'un compilateur.


II - Installation et mode d'emploi

Pour utiliser Tigger, procécez comme suit :
	- décompressez le fichier "tigger-MANZAMBI.tar.bz2" et placez vous dans le répertoire "tigger-MANZAMBI" crée
	- compilez le programme avec la commande "make"
	- pour supprimer les fichiers compilés, utilisez la commande "make clean"
	- pour lancer des tests unitaires, utilisez la commande "make check"
	- pour lancer le programme, utilisez la commande "java Tigger", puis tapez une expression suivant la liste des fonctionnalités implémentées (cf section III- Fonctionnalités de ce document)
	
La syntaxe à utiliser pour Tigger sera explicitée dans la partie suivante, ainsi que les différentes fonctionnalités de Tigger.

III - Fonctionnalités 

Les différentes fonctionnalités de Tigger :

Pour afficher la section "Fonctionnalités" pendant l'execution du programme, utilisez la commaande "help"

- Support des entiers relatifs 
	Ex : 0 ; 1 ; -1; 
	
- Support des opérations arithmétiques binaires (+, -, /, *)
	Ex : 1+1 ; 3-2 ; 4/2 ; 2*2 ;
	     2+3*4 ; 5-8/2 ;
	     Les priorités concernant la multiplication et la division sont respectées.
	
- Support des comparaisons (=, <>, <, <=, >, >=)
	Ex : 1=1 ; 1<>2 ; 1<2 ; 1<=1 ; 1>0 ; 1>=0
	Le résultat est sous forme d'entier : 1 si la comparaison est vraie, 0 sinon.

- Support de la fonction print
	Ex : print(if 1 then 2 else 3)
	La fonction print retourne le résultat de l'expression qui lui est donné en argument.

- Support du IfThenElse
	Ex : if 1 then 2 else 3 renverra 2
	     if 0 then 2 else 3 renverra 3
	IfThenElse supporte les instructions récursives.
	Ex : if if 1 then 2 else 3 then 4 else 5  renverra 4
	     if if 1 then 0 else 3 then 4 else 5  renverra 5

- Support des instructions multiples 
	Ex : 2+2, 3*3
	     if 1 then 2 else 3, 2+2
	On sépare les différentes expressions par des virgules.

- Support des scopes et des déclarations de variables 
	Ex : let var a:=2 var b:=3 in print(a+b), print(a*b) end 
	LetInEnd supporte les instructions récursives.
	Ex : let var a:=10 in print(a), let var b:=a*a in print(b) end print(a) end 
	
	
IV - Fonctionnement 

Le principe de fonctionnement de Tigger repose sur les patterns Composite et Visiteur.

V - Problèmes rencontrés

- Nom des variables : Pour des raisons de conflits de choix, le nom des variables déclarées dans les différents scopes sont de la forme ["a"-"z","A"-"Z"]

- Affectation : Un début d'implémentation de la fonctionnalité d'affectation a été effectué, mais il a ensuite été supprimé. En effet, l'exemple
	let var a:=10 in print(a), a:=a*a, print(a) end retournait 10000 et non 100 (a^4)

VI - Idées d'amélioration

- Pour améliorer Tigger on pourrait en premier finir d'implémenter toutes les fonctionnalités requises telles que l'affectation, le while, le for et les strings.

- De plus, on pourrait introduire la commande "ask" qui nous renverra le résultat d'une opération booléenne (telle qu'une comparaison) sous la forme d'une chaine de caractère.






