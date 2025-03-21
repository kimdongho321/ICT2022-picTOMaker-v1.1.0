package kr.co.picTO.member.dto.social;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NaverProfile {
    Response response;

    @Data
    public class Response {
        private String email;
        private String name;
        private String profile_image;
    }
}
