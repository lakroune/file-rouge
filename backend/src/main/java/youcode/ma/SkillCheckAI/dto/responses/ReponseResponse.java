package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReponseResponse {

    private Long id;
    private String contenu;
    private LocalDateTime dateReponse;
    private BigDecimal note;
    private String feedback;
    private Long questionId;
}
