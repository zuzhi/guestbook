(ns zuzhi.guestbook.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[guestbook starting]=-"))
   :start      (fn []
                 (log/info "\n-=[guestbook started successfully]=-"))
   :stop       (fn []
                 (log/info "\n-=[guestbook has shut down successfully]=-"))
   :middleware (fn [handler _] handler)
   :opts       {:profile :prod}})
