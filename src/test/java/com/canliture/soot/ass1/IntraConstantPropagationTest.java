package com.canliture.soot.ass1;

import com.canliture.soot.BaseTest;
import soot.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liture on 2021/9/19 4:29 下午
 */
public class IntraConstantPropagationTest extends BaseTest {

    @Override
    public List<String> getProcessDirs() {
        return Arrays.asList("target/test-classes/ass1");
    }

    @Override
    public String getPhaseNameOfPack() {
        return "jtp";
    }

    @Override
    public String getPhaseNameOfTransformer() {
        return "jtp.intra_cp";
    }

    @Override
    public Transformer getTransformer() {
        return new IntraCPTransformer();
    }
}
