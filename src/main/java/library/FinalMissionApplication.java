package library;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "도서관 관리 API 명세서",
                description = "LV3 최종 미션을 위한 도서관 관리 API 명세서입니다.",
                version = "v1.0.0"
        )
)
@SpringBootApplication
public class FinalMissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalMissionApplication.class, args);
    }

}

