package com.wspfeiffer.gfx

import groovy.transform.Canonical
import groovyx.javafx.beans.FXBindable

/**
 * Person
 * User: wpfeiffe
 * Date: 2/23/13
 * Time: 12:12 AM
 */
@Canonical
class PersonData
{

    @FXBindable String firstName
    @FXBindable String lastName
    @FXBindable String phone
    @FXBindable String ssn
}
