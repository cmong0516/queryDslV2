package hello.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(of = {"name","age"})
public class MemberDto {
    private String name;
    private int age;

    @QueryProjection
    public MemberDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
