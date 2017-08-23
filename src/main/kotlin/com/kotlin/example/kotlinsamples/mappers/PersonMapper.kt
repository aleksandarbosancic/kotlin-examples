package com.kotlin.example.kotlinsamples.mappers

import com.kotlin.example.kotlinsamples.domain.Person
import com.kotlin.example.kotlinsamples.dto.PersonDTO
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface PersonMapper {

    @Mapping(source = "phoneNumber", target = "phone")
    fun convertToDto(person: Person) : PersonDTO

    @InheritInverseConfiguration
    fun convertToModel(personDto: PersonDTO) : Person

    fun toList(persons: Array<Person>): List<PersonDTO>

}