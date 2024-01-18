package shop.back_hexshop.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.back_hexshop.domain.BaseEntity;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String memberId;

    private String name;

    private char sex;

    private String address;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    private String email;

    private int password;
}
