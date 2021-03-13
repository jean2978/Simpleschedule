FROM mongo:latest

RUN mkdir -p /data/db

ENV MONGO_INITDB_ROOT_USERNAME admin-user
ENV MONGO_INITDB_ROOT_PASSWORD admin-password
ENV MONGO_INITDB_DATABASE admin

ADD MongoDB/mongo-init.js /docker-entrypoint-initdb.d/

EXPOSE 27017