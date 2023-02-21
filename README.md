
# PAPILLON

`PAPILLON` est le *Portail Administratif des Plateformes Intégrant des
Logiciels Libres et Ouvertes au plus grand Nombre*.

Le nom est un clin d'oeil aux [CHATONS](https://chatons.org/) et un hommage à [Irma Testa](https://fr.wikipedia.org/wiki/Irma_Testa).


# Renseigner un service

**Vous êtes un organisme public et vous déployez un service s'appuyant
sur un logiciel libre ?**

Vous pouvez [ajouter votre service à PAPILLON](https://github.com/etalab/papillon/issues/new?assignees=bzg&labels=Soumission&template=ajouter-un-service.md&title=Nouveau+service+%3A+).

**Vous avez des questions sur les services que vous pouvez déployer ?**

Vous pouvez [solliciter](https://sill.etalab.gouv.fr/fr/contact) les référents du Socle interministériel de
logiciels libres.


# Schéma de donnée

-   **agency\_name:** Nom de l'organisme public mettant en oeuvre la solution
-   **agency\_url:** URL de l'organisme public mettant en oeuvre la solution
-   **anon\_network\_access:** Depuis quel réseau les utilisateurs anonymes
    peuvent utiliser le service ?
-   **content\_moderation\_method:** Quelles sont les méthodes de modération
    du service ?
-   **id:** Identifiant unique
-   **description:** Description du service déployé
-   **last\_update\_date:** Date de mise à jour du service
-   **ports:** Quels ports doivent être ouverts pour utiliser le service ?
-   **publication\_date:** Date de mise en production du service
-   **public\_sector:** Indication de la fonction publique concernée
-   **service\_name:** Nom du service déployé
-   **service\_url:** Nom du service déployé
-   **signup\_scope:** Qui peut s'inscrire au service comme utilisateur ?
-   **signup\_validation\_method:** Quelles sont les méthodes de validation
    des utilisateurs ?
-   **software\_comptoir\_id:** Identifiant du logiciel sur le [comptoir-du-libre.org](https://comptoir-du-libre.org)
-   **software\_name:** Nom du logiciel sur lequel s'appuie le service
-   **software\_sill\_id:** Identifiant SILL du logiciel sur lequel s'appuie le service
-   **usage\_scope:** Qui peut utiliser le service ?
-   **user\_network\_access:** Depuis quel réseau les utilisateurs
    enregistrés peuvent utiliser le service ?


# Contribuer

Ce dépôt ne permet pas d'ouvrir des issues ou des *pull requests*.

Les contributions au code sont les bienvenues sous forme de questions
ou de patches à envoyer à `~codegouvfr/codegouvfr-devel@lists.sr.ht`.


# Licence

2020-2023 Délégation interministérielle du numérique et les contributeurs du dépôt.

Le code source de ce dépôt est publié sous licence [EPL-2.0](LICENSE).

Le contenu du fichier [papillon.csv](papillon.csv) est publié sous [licence Ouverte 2.0](LICENSE.Etalab-2.0.md).

