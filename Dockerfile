# ビルドステージ
FROM openjdk:17-jdk-slim AS build
WORKDIR /workspace/app

# Gradle Wrapperとソースコードをコピー
COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY src src

# ソースコードをビルド
RUN ./gradlew build -x test
# RUN ./gradlew build

# 実行ステージ
FROM openjdk:17-jdk
VOLUME /tmp
# ビルドステージからビルドしたjarファイルをコピー
ARG JAR_FILE=/workspace/app/build/libs/*.jar
# コピーしたjarファイルを実行。JAR＿FILEはARGで定義した変数。
COPY --from=build ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# 上記ではマルチステージビルドを行っている。