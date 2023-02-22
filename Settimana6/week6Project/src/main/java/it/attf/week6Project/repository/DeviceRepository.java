package it.attf.week6Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.attf.week6Project.entities.Device;
import it.attf.week6Project.entities.DeviceState;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
	@Modifying
	@Query("update dispositivi SET user_id = :userid, stato = 'ASSEGNATO' where id = 1" )
	void assignDevice(@Param("userid") int userid, @Param ("stato") DeviceState s, @Param("id") int id);
	
	@Query("SELECT * FROM dispositivi WHERE stato = :stato")
	List<Device> getDevByState(@Param("stato")String s);
}
