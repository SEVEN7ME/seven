FROM java:8-jre

MAINTAINER seven 孙飞 <sunfei96800@163.com>

RUN mkdir -p /seven

WORKDIR /seven

VOLUME /seven/logs

ENV TZ Asia/Shanghai

EXPOSE 7011

ADD  ./target/farm-register.jar ./

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx300m", "-jar", "farm-register.jar"]
