package kr.co.sboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.sboard.dto.UserDTO;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "User")
public class UserEntity {
    @Id
    private String uid;
    private String pass;
    private String name;
    @Column(name = "nick", unique = true)
    private String nick;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "hp", unique = true)
    private String hp;
    @ColumnDefault("USER")
    private String role;
    private String zip;
    private String addr1;
    private String addr2;
    private String regip;
    @CreationTimestamp
    private LocalDateTime regDate;
    private LocalDateTime leaveDate;

    public UserDTO toDTO(){
        return UserDTO.builder()
                .uid(uid)
                .pass1(pass)
                .name(name)
                .nick(nick)
                .email(email)
                .hp(hp)
                .role(role)
                .zip(zip)
                .addr1(addr1)
                .addr2(addr2)
                .regip(regip)
                .regDate(regDate)
                .leaveDate(leaveDate)
                .build();
    }

}
