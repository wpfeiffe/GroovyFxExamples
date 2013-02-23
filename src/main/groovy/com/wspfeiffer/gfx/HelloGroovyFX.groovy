package com.wspfeiffer.gfx

import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder
import javafx.stage.StageStyle
import javafx.stage.Stage

/**
 * Hello world for groovy fx
 */
class HelloGroovyFX
{
    List<PersonData> people = new ArrayList<>()

    public static void main(String[] args)
    {
        new HelloGroovyFX().run()
    }

    HelloGroovyFX(List<PersonData> people)
    {
        this.people = people
    }

    HelloGroovyFX()
    {
        this.people.add(new PersonData([firstName: "Bill", lastName: "Pfeiffer", phone: "8005551212", ssn: "111-22-3333" ]))
        this.people.add(new PersonData([firstName: "Brian", lastName: "Pfeiffer", phone: "8005551212", ssn: "111-22-3333" ]))
        this.people.add(new PersonData([firstName: "Liam", lastName: "Pfeiffer", phone: "8005551212", ssn: "111-22-3333" ]))
        this.people.add(new PersonData([firstName: "Deanna", lastName: "Pfeiffer", phone: "8005551212", ssn: "111-22-3333" ]))
    }

    void run()
    {
        GroovyFX.start
        {
           stage(title: 'RMOUG Training Days 2013',
                 width: 300, height: 100,
                 show: true)
           {
              scene
              {
                 stackPane
                 {
                    text('Hello GroovyFX!', x: 50, y: 40)
                 }
              }
           }
        }
    }

    void exampleCode()
    {
        GroovyFX.start {
            stage(title: 'GroovyFX Hello World', visible: true) {
                scene(fill: BLACK, width: 800, height: 250) {
                    hbox(padding: 60) {
                        text(text: 'William', font: '80pt sanserif') {
                            fill linearGradient(endX: 0, stops: [PALEGREEN, SEAGREEN])
                            effect glow(0.8)
                        }
                        text(text: 'Pfeiffer', font: '80pt sanserif') {
                            fill linearGradient(endX: 0, stops: [CYAN, DODGERBLUE])
                            effect dropShadow(color: DODGERBLUE, radius: 25, spread: 0.25)
                        }
                    }
                }
            }
        }
    }

    void showTable()
    {
        GroovyFX.start {
            stage(title: 'Show Table', visible: true) {
                scene(fill: GROOVYBLUE) {
                    tableView(selectionMode: "multiple", cellSelectionEnabled: true, editable: true, items: people) {
                        tableColumn(editable: true, property: "firstName", text: "First", prefWidth: 80,
                                onEditCommit: { event ->
                                    PersonData item = event.tableView.items.get(event.tablePosition.row)
                                    item.firstName = event.newValue
                                }
                        )
                        tableColumn(editable: true, property: "lastName", text: "Last", prefWidth: 80,
                                onEditCommit: { event ->
                                    PersonData item = event.tableView.items.get(event.tablePosition.row)
                                    item.lastName = Integer.valueOf(event.newValue)
                                }
                        )
                        tableColumn(editable: true, property: "phone", text: "Phone", prefWidth: 80,
                                onEditCommit: { event ->
                                    PersonData item = event.tableView.items.get(event.tablePosition.row)
                                    item.phone = event.newValue;
                                }
                        )
                        tableColumn(editable: true, property: "ssn", text: "SSN", prefWidth: 120,
                                onEditCommit: { event ->
                                    PersonData item = event.tableView.items.get(event.tablePosition.row)
                                    item.ssn = event.newValue;
                                }
                        )
                    }
                }
            }
        }
    }
}


