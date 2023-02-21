package ru.romanov.RestApplication.MyRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romanov.RestApplication.MyRestApp.models.Person;
@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
