# Ferramentas utilizadas na pesquisa de mestrado

## ETL via TOS-DI

O arquivo ProjetoTalend.zip, localizado na pasta etl, contém o projeto em TOS-DI para a atividade de ETL a qual realiza a extração dos dados de servidores do Portal da Transparência, seguido de algumas transformações/normalizações e carregamento em base de dados MySQL.

## Mapeamento RDB2RDF via morph-rdb

Os arquivos r2rml.morph.properties e r2rml_map.ttl, localizados na pasta rdb2rdf, são responsáveis, respectivamente, pela configuração de acesso à base de dados e o mapeamento das tabelas/colunas na ontologia desenvolvida, denominada Public Servant Ontology (http://purl.org/publicservant/ontology/). Arquivos estes utilizados pela ferramenta morph-rdb, disponível em https://github.com/oeg-upm/morph-rdb.
