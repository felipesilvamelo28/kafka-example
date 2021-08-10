package br.com.example.kafkaexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * NA PASTA DOCKER ESTÁ O DOCKER-COMPOSE PARA RODAR OS SERVIÇOS LOCAIS;
 * O KAFDROP É UM GERENCIADOR DO KAFKA PARA NAVEGADOR, VOCÊ PODE CRIAR O TÓPICO POR LÁ;
 * O KSQLDB SERVE PARA CONSULTAR A FILA DE MENSAGENS ENVIADAS, CONSULTE A DOCUMENTAÇÃO PARA MAIS INFOS;
 * O ARQUIVO "logback.xml" SERVE PARA DEIXAR O LOG DO KAFKA MAIS LIMPO AO CONSUMIR;
 *
 * ESSE PROJETO TEM EXEMPLOS DE CONSUMIDOR E PRODUTOR SIMPLES, PARA UM PROJETO REAL SERIA NECESSÁRIO CRIAR UM @SERVICE
 * PARA ISSO E CONFIGURAR AS VARIÁVEIS DE AMBIENTE COM OS DADOS DO KAFKA.
 *
 * ALÉM DISSO É NECESSÁRIO PENSAR NUMA BOA ESTRATÉGIA DE LOGS, OS PRINTS SÃO APRA SIMPLES CONFERÊNCIA DO ENVIO E
 * RECEBIMENTO DAS MSGS. *
 *
 * REFERÊNCIA: https://github.com/confluentinc/examples/tree/6.2.0-post/clients/cloud/kotlin
 */

@SpringBootApplication
class KafkaexampleApplication

fun main(args: Array<String>) {
	runApplication<KafkaexampleApplication>(*args)
}
