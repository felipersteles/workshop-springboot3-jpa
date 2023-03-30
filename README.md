# Learning spring bott

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