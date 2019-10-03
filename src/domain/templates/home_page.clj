(ns domain.templates.home-page)

(defn template [article]
  [:html {:lang "en"}
   [:head
    [:meta {:charset "UTF8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
    [:title "Alexander Pittendrigh's Blog - Ramblings of a Software Developer"]
    [:link {:href "https://fonts.googleapis.com/css?family=Roboto&display=swap" :rel "stylesheet"}]
    [:link {:rel "stylesheet" :type "text/css" :href "css/main.css"}]]
   [:body article]])