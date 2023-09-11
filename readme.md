Kotlin/Springで作成されたアプリケーションにデータベースとキャッシュを接続する、最小で構成されたサンプル。<br>
後学のために置いておく。<br>

1.　環境構築。DockerComposeを使用。<br>
2.　「こんにちは、みなさん！」というメッセージをJSONで送るAPIを作成。<br>
3.　データベース（MySQL）とキャッシュ（Redis）の設定をする。<br>

注意点<br>
1.　application.propatiesの設定に注意すること。特に、DockerComposeを使うとき、ホスト名を「localhost」ではなく、コンテナの名前にすることを忘れない。<br>
2.　java11の「javax」を「jakarta」に変更するのを忘れない。<br>
3.　当然ではあるが、不要な依存関係を残さない。コメントアウト等で除外する。<br>