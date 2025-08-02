package net.javaguides.springboot_newproject.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.entity.UserEntity;
import net.javaguides.springboot_newproject.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
}
