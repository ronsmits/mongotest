FROM tomee/plus:1.7.2-jre7

WORKDIR /usr/local/tomee

ADD tomee.xml conf/tomee.xml
ADD mongo-java-driver-2.12.3.jar lib/mongo-java-driver-2.12.3.jar

RUN wget "http://ronsmits.org:8110/restServices/archivaServices/searchService/artifact?g=org.ronsmits&a=tomee-mongo-test&v=LATEST&p=war" -O webapps/tomee-mongo-test.war

CMD ["catalina.sh", "run"]
