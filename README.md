# Ferramentas utilizadas na pesquisa de mestrado

## ETL via TOS-DI

O arquivo ETL_PortalTransparencia contém o projeto em TOS-DI para a atividade de ETL a qual realiza a extração dos dados de servidores do Portal da Transparência, seguido de algumas transformações/normalizações e carregamento em base de dados MySQL.

## Mapeamento RDB2RDF via morph-rdb

Os arquivos r2rml.morph.properties e r2rml_map.ttl são responsáveis, respectivamente, pela configuração de acesso à base de dados e o mapeamento das tabelas/colunas na ontologia desenvolvida, denominada PSO (http://purl.org/pso/ns/). Arquivos estes utilizados pela ferramenta morph-rdb, disponível em https://github.com/oeg-upm/morph-rdb.
