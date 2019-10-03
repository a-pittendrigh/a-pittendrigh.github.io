(ns domain.templating.html-generator
  (:require [hiccup.core :as h]
            ;;for testing
            [domain.templates.home-page :as home-page]
            [articles.the-living-blog]))

(defn template->html [template]
  (h/html template))

(defn string->file [string filename]
  (spit filename string))

(defn template->file [template filename]
  (-> template
      (template->html)
      (string->file filename)))

(comment
  (template->html (home-page/template articles.the-living-blog/article))
  (template->file (home-page/template articles.the-living-blog/article) "../../../index.html"))