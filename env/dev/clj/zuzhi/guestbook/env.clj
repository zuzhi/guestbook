(ns zuzhi.guestbook.env
  (:require
    [clojure.tools.logging :as log]
    [zuzhi.guestbook.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[guestbook starting using the development or test profile]=-"))
   :start      (fn []
                 (log/info "\n-=[guestbook started successfully using the development or test profile]=-"))
   :stop       (fn []
                 (log/info "\n-=[guestbook has shut down successfully]=-"))
   :middleware wrap-dev
   :opts       {:profile       :dev
                :persist-data? true}})
