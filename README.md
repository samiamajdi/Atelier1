# Atelier1
Ce travail entre dans le cadre d'une atelier en java j2e , qui sert à gérer les commandes des clients en suivant le diagramme de classe suivant :
![image](https://user-images.githubusercontent.com/85033376/203441725-0d80118c-9333-44dd-9e06-64ba50138f23.png)

Nom de la base de donnée : 
minimarket
Pour créer la base de donnée, veuillez executer le scripte ci-dessus pour avoir les tables necessaires au fonctionement du projet.
L'articulation de l'application se fait de la maniere suivante :
La premiere page à visiter : http://localhost:[PORT]/mini/servv , numéro de port à modifier selon votre configuration du serveur
Premierement on crée un client : 
![image](https://user-images.githubusercontent.com/85033376/203441906-fe155dd5-4a70-4276-8286-77092f8fc8b2.png)
Apres l'enregistrement de ce client , on vous donne la possibilité de créer une commande en verifiant votre identifiant ,sinon vous avez la possibilité de consulter la liste des commandes deja faites:
![image](https://user-images.githubusercontent.com/85033376/203442082-597d0219-f0bf-4547-952a-0da7390e06ae.png)
![image](https://user-images.githubusercontent.com/85033376/203442638-61a4acc2-5e23-46cc-8bd4-1ed39d5c7469.png)
Vous pouvez egalement consulter la liste des lignes de commande, ca veut dire chaque commande et les produits qu'elle contient:
![image](https://user-images.githubusercontent.com/85033376/203442766-1cff48ff-8846-4d70-be64-5f738bd24689.png)
Revenons à la création de la commande :
Apres la création de la commande , on vous dirige vers la liste des produits : 
la vous pouvez soit commande un produit , soit le modifier ou le supprimer .
![image](https://user-images.githubusercontent.com/85033376/203442392-e0fd0ef5-61b5-4ffb-84bf-a7ca40c0599c.png)
Lorsque vous inserer la quantité de votre commande , une ligne_cmd va etre inséré dans notre base de donnée sous votre identifiant et en la liant à votre commande deja crée.
* Notant que lorsque vous commandez un produit la quantité de stock va biensur décrementer :
vous pouvez aussi modifier un article avec l'interface suivante :
![image](https://user-images.githubusercontent.com/85033376/203442862-3c4ed00d-2bbf-4921-bb67-07322fa069be.png)
Ou ajouter un article comme ceci:
![image](https://user-images.githubusercontent.com/85033376/203443022-806a27dd-7a35-4dae-bb4f-67f7cf8c5311.png)






