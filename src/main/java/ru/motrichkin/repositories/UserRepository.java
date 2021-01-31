package ru.motrichkin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.motrichkin.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
