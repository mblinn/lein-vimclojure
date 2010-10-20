(ns leiningen.vimclojure
  (:use [leiningen.compile :only [eval-in-project]]))

(defn vimclojure
  "Launch a vimclojure nailgun server."
  ([project addr-port]
   (eval-in-project 
     project
     `(do (try (~'vimclojure.nailgun.NGServer/main
                   (into-array String [~addr-port]))
            (catch Exception e#
              (println e#)
              (println "Make sure vimclojure/server is added as a"
                       "dev-dependency in your project.clj."))))))
  ([project] (vimclojure project "127.0.0.1")))
