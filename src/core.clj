(ns core
  (:require [cheshire.core :as json]
            [clojure.spec.alpha :as s]
            [semantic-csv.core :as semantic-csv]
            [clojure.spec.gen.alpha :as gen]
            ;; [java-time :as t]
            ))

(def papillon
  {:title       "Spécifications pour les données du portail PAPILLON"
   :description "Spécifications pour les données du portail PAPILLON"
   :author      "Etalab"
   :contact     "contact@code.gouv.fr"
   :contributor "Etalab"
   :version     "2020-05-15"
   :created     "2020-05-15"
   :updated     "2020-05-15"
   :homepage    "https://github.com/etalab/papillon"
   :example     "https://github.com/etalab/papillon/blob/master/papillon.csv"
   :fields
   [{:name        "agency_name"
     :description "Nom de l'organisme public"
     :example     "DINUM/Etalab"
     :type        "string"
     :constraints {:required true}}

    {:name        "agency_URL"
     :description "URL de l'organisme public"
     :example     "https://www.etalab.gouv.fr"
     :type        "string"
     :constraints {:required true}}

    {:name        "service_name"
     :description "Nom du service déployé"
     :example     "Forum Etalab"
     :type        "string"
     :constraints {:required false}}

    {:name        "service_URL"
     :description "URL du service déployé"
     :example     "https://forum.etalab.gouv.fr/"
     :type        "string"
     :constraints {:required true}}

    {:name        "description"
     :description "Description du service proposé"
     :example     "Forum en ligne"
     :type        "string"
     :constraints {:required true}}

    {:name        "software_name"
     :description "Nom du logiciel sur lequel s'appuie le service"
     :example     "Discourse"
     :type        "string"
     :constraints {:required true}}

    {:name        "software_sill_id"
     :description "Identifiant SILL du logiciel utilisé"
     :example     "33"
     :type        "string"
     :constraints {:required true}}

    {:name        "publication_date"
     :description "Date de mise en oeuvre du service"
     :example     "2020-04-02T05:24:57Z"
     :type        "datetime"
     :constraints {:required false}}

    {:name        "last_update_date"
     :description "Date de dernière mise à jour du service"
     :example     "2020-04-02T05:24:57Z"
     :type        "datetime"
     :constraints {:required false}}

    {:name        "account_scope"
     :description "Public autorisé à créer un compte sur le service"
     :example     "Tout le monde"
     :type        "string"
     :constraints {:required false}}

    {:name        "usage_scope"
     :description "Public autorisé à consulter le service"
     :example     "Tout le monde peut consulter les contenus proposés via le service"
     :type        "string"
     :constraints {:required false}}

    {:name        "signup_validation_method"
     :description "Méthode de validation des inscriptions au service"
     :example     "Validation après envoi d'un email personnalisé"
     :type        "string"
     :constraints {:required false}}
    {:name        "contents_moderation_method"
     :description "Méthode de modération des contenus du service"
     :example     "Modération manuelle des contenus par Etalab"
     :type        "string"
     :constraints {:required false}}
    ]
   })

(s/def ::agency_name string?)
(s/def ::agency_url string?) ;; uri?
(s/def ::service_name string?)
(s/def ::service_URL string?) ;; uri?
(s/def ::description string?)
(s/def ::software_name string?)
(s/def ::software_sill_id string?)
(s/def ::publication_date string?) ;; FIXME
(s/def ::last_update_date string?) ;; FIXME

;; FIXME: define scopes and methods
(s/def ::account_scope string?)
(s/def ::usage_scope string?)
(s/def ::signup_validation_method string?)
(s/def ::content_moderation_method string?)

(s/def ::papillon
  (s/keys :req-un
          [
           ::agency_name
           ::agency_url
           ::service_url
           ::description
           ::software_name
           ::software_sill_id
           ]
          :opt-un
          [
           ::service_name
           ::publication_date
           ::last_update_date
           ::account_scope
           ::usage_scope
           ::signup_validation_method
           ::content_moderation_method
           ]))

(defn valid-schema? [f]
  (every? true? (map #(s/valid? ::papillon %)
                     (semantic-csv/slurp-csv f))))

(defn -main []
  (spit "papillon-schema.json"
        (json/generate-string papillon {:pretty true})))
