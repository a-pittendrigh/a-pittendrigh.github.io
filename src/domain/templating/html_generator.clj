(ns domain.templating.html-generator
  (:require [hiccup.core :as h]
            [domain.templates.home-page :as home-page]))

(defn template->html [template]
  (h/html template))

(template->html (home-page/template))