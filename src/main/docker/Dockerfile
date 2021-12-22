FROM debian:jessie

EXPOSE 749 88

ENV DEBIAN_FRONTEND noninteractive
RUN apt-get -qq update
RUN apt-get -qq install locales krb5-kdc krb5-admin-server
RUN apt-get -qq clean

RUN locale-gen "en_US.UTF-8"
RUN echo "LC_ALL=\"en_US.UTF-8\"" >> /etc/default/locale

ENV REALM EXAMPLE.COM
ENV SUPPORTED_ENCRYPTION_TYPES aes256-cts-hmac-sha1-96:normal
ENV USER_PRINCIPAL user
ENV USER_PASSWORD secret
ENV APP_PRINCIPAL HTTP/app.example.com

COPY init-script.sh /tmp/
CMD /tmp/init-script.sh
