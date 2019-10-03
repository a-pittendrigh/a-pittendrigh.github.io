(ns articles.the-living-blog)

(def article
  [:article
   [:h1 "The Living Blog"]
   [:small "1 October 2019"]
   [:p "For the longest time I've wanted to have my own blog.
I've wanted to create something that would allow me to share what I've learnt, but also something that I
could use to teach myself in turn, by doing things I've always wanted to do."]
   [:p "The blog will evolve over time, as I learn new things and implement them here.
Content will be ordered in descending date of publication (newest to oldest)."]
   [:p "I want the blog to integrate with other platforms, to look beautiful, to be elegant in code and in how it looks. I want the blog to be easy to index, so that any helpful things I find are freely available to the public and easy to find."]
   [:p "The blog is using GitHub pages for now, but I feel like experimenting with server-side rending in Clojure. Perhaps it's best to just experiment at work and blog here, since switching to a served blog will introduce many hurdles."]
   [:p "First, I want to switch the blog to "
    [:a {:href "https://github.com/weavejester/hiccup"} "Hiccup"] ", because while HTML is great for content markup, it's not as nice for developers as Hiccup is."]
   [:p "Source at "
    [:a {:href "https://github.com/a-pittendrigh/a-pittendrigh.github.io"}
     "https://github.com/a-pittendrigh/a-pittendrigh.github.io"]]])