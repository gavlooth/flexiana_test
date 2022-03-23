
(defproject flexiana "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.0"]
                 ;; [org.clojure/core.async "1.3.610"]
                 ;;ring
                 [ring/ring-jetty-adapter "1.9.1"]
                 [ring/ring-core"1.9.1"]
                 ;; [ring/ring-json "0.5.0"]
                 ;;routing libraries
                 [metosin/reitit-core "0.5.12"]
                 [metosin/reitit-middleware "0.5.12"]
                 [metosin/reitit-ring "0.5.12"]


                 [org.clojure/tools.logging "1.1.0"]
                 [org.apache.logging.log4j/log4j-core "2.13.0"]
                 [org.apache.logging.log4j/log4j-api "2.13.0"]
                 [org.apache.logging.log4j/log4j-jcl "2.13.0"]
                 ;; other
                 #_[commons-codec/commons-codec "1.9"]
                 #_[org.apache.commons/commons-lang3 "3.10"]
                 ;;dependecy injection
                 #_[juxt/clip "0.16.0"]
                 #_[com.fzakaria/slf4j-timbre "0.3.19"]
                 ;; matching library
                 #_[org.clojure/core.match "1.0.0"]]
                 ;;http requests 
  ;; :main ^:skip-aot flexiana-service-core

  :jvm-opts ["-Dclojure.tools.logging.factory=clojure.tools.logging.impl/log4j2-factory"]
  :target-path "target/%s"
  :profiles {:dev {:source-paths ["src/clj" "dev"]
                   :dependencies [[org.clojure/tools.namespace "LATEST"]
                                  [jumblerg/ring-cors "2.0.0"]]
                   :repl-options {:init-ns user}
                   :init (println "here we are in" *ns*)}
             :uberjar {:source-paths ["src/clj"]; "prod"
                       :main flexiana-core.core
                       :aot :all}})

