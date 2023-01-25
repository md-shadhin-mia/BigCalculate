FROM adoptopenjdk/openjdk17:alpine-jre

ENV APP_FILE myapp.jar
ENV APP_HOME /usr/app

COPY target/$APP_FILE $APP_HOME/

WORKDIR $APP_HOME

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar $APP_FILE"]
