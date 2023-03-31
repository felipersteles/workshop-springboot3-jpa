# Learning spring bott

## Anotacoes
### ENUM
É bom controlar manualmente o code para que seja mais facil a manuntenção do codigo

## JPA
Ferramenta de mapeamento de objeto-relacional padrão do Java. Em outras palavras esta ferramenta converte o modelo de orientação a objetos para o modelo relacional do Banco de dados.
### Anotações do JPA
@Entity -> Declara uma entidade
@Id -> Primary key
@GeneratedValue -> Gera automaticamente a PK
@Table -> define no nome da tabela sql

### Tipos de associação
- Um para muitos: 
* No muitos
@ManyToOne
@JoinColumn() -> definir a chave estrangeira no BD

* No um
@OneToMany(mappedBy = "[nome da variavel]")

## Detalhes
### ISO 8601
Muito importante padronizar a data do projeto. Neste projeto estamos utilizando o UTC (Z no final)

### Erro no jackson
- Jackson 
biblioteca de serialização. a tendencia é ficar em um loop caso haja uma dependencia. para evitar o loop é necessario a anotation: @JsonIgnore