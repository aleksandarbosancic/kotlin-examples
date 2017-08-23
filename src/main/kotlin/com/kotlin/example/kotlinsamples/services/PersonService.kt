package com.kotlin.example.kotlinsamples.services

import com.kotlin.example.kotlinsamples.domain.Person
import com.kotlin.example.kotlinsamples.domain.User
import com.kotlin.example.kotlinsamples.dto.PersonDTO
import com.kotlin.example.kotlinsamples.mappers.PersonMapper
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.time.Instant

@Component
class PersonService {

    val personMapper : PersonMapper = Mappers.getMapper(PersonMapper::class.java)

    val allPersons : Array<Person> = arrayOf(
            Person(
                    firstName = "grahamcox",
                    lastName = "Graham",
                    age = 23,
                    phoneNumber = "123"
            ),
            Person(
                    firstName = "abosancic",
                    lastName = "boske",
                    age = 29,
                    phoneNumber = "123"
            )
    )

    fun getPerson(@PathVariable username : String) = allPersons.filter { user -> user.firstName.equals(username) }.firstOrNull()

    fun getPersons(): List<PersonDTO> = personMapper.toList(allPersons)

}