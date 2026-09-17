@startuml
class OrganizadorEnciclopedia {
    + ordenar(repisa1: Deque<Integer>, repisa2: Deque<Integer>): List<Integer>
    - insertarOrdenado(lista: List<Integer>, elemento: int): void
}
@enduml
