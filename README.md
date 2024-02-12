# Portfolio-Pyroshiv
J'ai mis ce projet là car je n'avais pas mis sur les deux autres mods d'entités customisées. Le projet de ce mod était d'ajouter principalement de nouveaux golems œuvrant dans 
diverses tâches come l'agriculture, le combat etc.

Le mod est toujours en 1.20.1 avec le fichier jar mis avec le programme
-Fonctionnement du composteur golem :
-GUI du golem:
J'ai donc mis ici mon golem composteur. Lorsque que l'on fait un clic droit dessus, cela ouvre une GUI avec 5 slots verts et 3 rouges. Si on y met un objet compostable, on a une
chance que cela augmente le niveau du composteur lié au golem de 1 (représenté par une image de composteur dans le gui). Lorsque le composteur atteint son niveau maximum,
on obtient une poudre d'os dans le slot rouge, à savoir que le golem prend en priorité dans le premier slot vert remplis et aoute une poudre d'os dans le premier slot rouge.

On peut aussi mettre de la poudre d'os dans un slot vert pour donner directement une poudre d'os dans le slot rouge.

On a aussi un petit rendue du golem dans le gui (voir image gui_golem_composteur pour un aperçu) 

-Mécanique de fertilisation:
Si le golem a une poudre d’os, il ira l'utiliser sur une culture ou une pousse d'arbre la plus proche, permettant ainsi d'automatiser le plaçage de bone meal 

-Absence de bone meal:
Dans le cas où le golem n'a plus de bonemeal ni d'item se transformant en bone meal, il ira directement se servir dans le coffre le plus proche si celui a des éléments fertilisables.

-Apparition du golem:
Comme tout golem, on peut le faire apparaître grâce à un arrangement de blocs
Il apparaît ainsi :
0
/
=    avec 0 la citrouille (qu'il faut placer en dernier), / n'importe quel type de bois et = un composteur
(voir image totem_golem_composteur,sachant que la citrouille est à placer en dernier pour le foncionnement)

PS : Le comportement de l'IA peut être un peu bogué à cause d'un conflit de tâches que je n'ai pas encore résolue mais le golem fonctionne dans la plupart des cas
