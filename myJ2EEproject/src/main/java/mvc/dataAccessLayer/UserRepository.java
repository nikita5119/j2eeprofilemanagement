package mvc.dataAccessLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	@Query(value="SELECT count(1) FROM user WHERE userid= ?1 and password=?2",nativeQuery = true)
	public int checkUidPwdInDB(String users,String password);
}

