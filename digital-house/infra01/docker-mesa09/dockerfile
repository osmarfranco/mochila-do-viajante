FROM openjdk:11
WORKDIR /diretorioprinc/
COPY ./src/CoffeeMachine.java /diretorioprinc/
RUN ["javac", "CoffeeMachine.java"]
ENTRYPOINT ["java", "CoffeeMachine"]