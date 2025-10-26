package racingcar.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import racingcar.ErrorMessage;

public class ValidatorTest {

    @Test
    @DisplayName("rawName 문자열이 문제 없는지, 그리고 split 되는지 테스트")
    public void nameValidateAndSplit_o() throws IllegalArgumentException {
        String rawName = "pobi,woni,";
        List<String> nameList = Validator.nameValidateAndSplit(rawName);

        List<String> nameListAnswer = new ArrayList<>();
        nameListAnswer.add("pobi");
        nameListAnswer.add("woni");
        nameListAnswer.add("jun");
        assertThat(nameList).isEqualTo(nameListAnswer);
    }

    @Test
    @DisplayName("name에서 INPUT_BLANK 테스트(빈칸일 경우)")
    public void nameValidateAndSplit_x_INPUT_BLANK1() throws IllegalArgumentException {
        String blankName = "";

        assertThatThrownBy(() -> Validator.nameValidateAndSplit(blankName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ErrorMessage.INPUT_BLANK);
    }

    @Test
    @DisplayName("name에서 INPUT_BLANK 테스트(이름 중 빈칸이 있는 경우 혹은 쉼표(,)로 끝나는 경우")
    public void nameValidateAndSplit_x_INPUT_BLANK2() throws IllegalArgumentException {
        String blankName = "pobi,,woni,";

        assertThatThrownBy(() -> Validator.nameValidateAndSplit(blankName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ErrorMessage.INPUT_BLANK);
    }

    @Test
    @DisplayName("name에서 LENGTH_OVER 테스트")
    public void nameValidateAndSplit_x_LENGTH_OVER() throws IllegalArgumentException {
        String rawNameLengthOver = "pobi,wonijun";

        assertThatThrownBy(() -> Validator.nameValidateAndSplit(rawNameLengthOver))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ErrorMessage.LENGTH_OVER);
    }

    @Test
    @DisplayName("name에서 DUPLICATE_NAME 테스트")
    public void nameValidateAndSplit_x_DUPLICATE_NAME() throws IllegalArgumentException {
        String rawNameLengthOver = "pobi,woni,woni";

        assertThatThrownBy(() -> Validator.nameValidateAndSplit(rawNameLengthOver))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ErrorMessage.DUPLICATE_NAME);
    }

    @Test
    @DisplayName("시도 횟수로 음수 횟수 입력되면 NEGATIVE_TURNNUM 에러 실행")
    public void turnNumValidate_x() throws IllegalArgumentException {
        String turnNum = "-2";

        assertThatThrownBy(() -> Validator.turnNumValidate(turnNum))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ErrorMessage.NEGATIVE_TURNNUM);
    }
}
