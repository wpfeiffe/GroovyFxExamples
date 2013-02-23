package com.wspfeiffer.gfx

import org.junit.Test
import spock.lang.Specification

/**
 * GroovyFX tests
 */
class HelloGroovyFXTests extends Specification
{

    def "test Run"()
    {
        setup:
            HelloGroovyFX helloGroovyFX = new HelloGroovyFX()
        when:
            helloGroovyFX.run()
        then:
            true == true

    }


    def "test exampleCode"()
    {
        setup:
            HelloGroovyFX helloGroovyFX = new HelloGroovyFX()
        when:
            helloGroovyFX.exampleCode()
        then:
            true == true
    }

    def "test table"()
    {
        setup:
            HelloGroovyFX helloGroovyFX = new HelloGroovyFX()
        when:
            helloGroovyFX.showTable()
        then:
            true == true

    }
}
