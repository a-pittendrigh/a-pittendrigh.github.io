(ns domain.templating.html-generator
  (:require [hiccup.core :as h]
            ;;for testing
            [domain.templates.home-page :as home-page]
            [articles.the-living-blog]))

(defn template->html [template]
  (h/html template))

(comment
  (template->html (home-page/template articles.the-living-blog/article)))