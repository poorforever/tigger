tigger-MANZAMBI

Réalisé par Anaël MANZAMBI et Cédric SADOUNE

Rapport de projet : "INF-4301A : Langages et compilation" 

I - Présentation
II - Installation et mode d'emploi
III - Fonctionnalités 
IV - Fonctionnement 
V - Problèmes rencontrés
VI - Idées d'amélioration
VII - Rattrapages

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

- Support des fonctions 
	Ex : let function foo()=42 function bar(a)=a function baz(x,y,z)=if x the y else z in .foo()-.bar(42)=.baz(42,0,1) end 

		
IV - Fonctionnement 

Le principe de fonctionnement de Tigger repose sur les patterns Composite et Visiteur.

V - Problèmes rencontrés

- Fonctions : 
	- Dû à un conflit de choix, l'appel (et non la déclaration d'une fonction) doit être précédé d'un caractère point "." telle que :
		let function foo(x)=x in .foo(2) end renverra 2.
	- Lors d'une déclaration multiple de fonction, le nom des arguments ne peut pour l'instant pas être le même dans différentes fonctions.
		Ex : let function foo(x,y)=.bar(y,x) function bar(x,y)=x-y in .foo(2,3) end 
		ne fonctionnera pas.
		Ex : let function foo(x,y)=.bar(y,x) function bar(a,b)=a-b in .foo(2,3) end
		fonctionnera.

VI - Idées d'amélioration

- Pour améliorer Tigger on pourrait en premier finir d'implémenter toutes les fonctionnalités requises telles que l'affectation, le while, le for et les strings.


VII - Rattrapages

Des modifications ont été apportés au projets. Diverses amélioratons seront effectuées. :

- Le nom des variables peut désormais être une chaîne de caractères, telles que foo et bar, à l'exception de chaîne speciales telles que "let", "in", "end", "if" .. et autres chaînes utilisées par le parser pour reconnaître et différencier des expressions.

- Une gestion des erreurs a été partiellement implementée. Le programme ne s'arrête plus en cas d'erreur de saisie, mais il peut encore cesser en cas de StackOverFlowException. 

- Des test supplémentaires ont été ajoutés, et l'AST n'est pas construit en Java cette fois-ci. En effet, les tests sont dans un fichier texte qui est parsé. 

- Dû à un conflit de choix, l'appel (et non la déclaration d'une fonction) doit être précédé d'un caractère point "." telle que :
	let function foo(x)=x in .foo(2) end renverra 2 
- Lors d'une déclaration multiple de fonction, le nom des arguments ne peut pour l'instant pas être le même dans différentes fonctions.
	Ex : let function foo(x,y)=.bar(y,x) function bar(x,y)=x-y in .foo(2,3) end 
	ne fonctionnera pas.
	Ex : let function foo(x,y)=.bar(y,x) function bar(a,b)=a-b in .foo(2,3) end
	fonctionnera.





