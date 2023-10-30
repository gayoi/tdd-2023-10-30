package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("10 + 10 =  20")
    void t1() {
        int rs = Calc.run("10 + 10");

        assertThat(rs).isEqualsTo(20);
    }
}

