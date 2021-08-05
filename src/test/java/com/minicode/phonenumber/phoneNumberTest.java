package com.minicode.phonenumber;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class phoneNumberTest {

    @Test
    public void hasMapping(){
        int[] input = {2,3,4,5};
        SolutionDFS solutionDFS = new SolutionDFS();
        List<String> result = null;
        try {
            result = solutionDFS.letterCombinations(input);
            System.out.println(result);
            assertThat(result).hasSize(81);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void existNoMapping(){
        int[] input = {1,2,3,4};
        SolutionDFS solutionDFS = new SolutionDFS();
        List<String> result = null;
        try {
            result = solutionDFS.letterCombinations(input);
            System.out.println(result);
            assertThat(result).hasSize(27);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void existNoMappingReverse(){
        int[] input = {4,3,2,1};
        SolutionDFS solutionDFS = new SolutionDFS();
        List<String> result = null;
        try {
            result = solutionDFS.letterCombinations(input);
            System.out.println(result);
            assertThat(result).hasSize(27);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void tensNoMapping(){
        int[] input = {2,3,4,10};
        SolutionDFS solutionDFS = new SolutionDFS();
        List<String> result = null;
        try {
            result = solutionDFS.letterCombinations(input);
            System.out.println(result);
            assertThat(result).hasSize(27);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void tensNoMappingReverse(){
        int[] input = {10,2,3,4};
        SolutionDFS solutionDFS = new SolutionDFS();
        List<String> result = null;
        try {
            result = solutionDFS.letterCombinations(input);
            System.out.println(result);
            assertThat(result).hasSize(27);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void tens(){
        int[] input = {2,3,4,23};
        SolutionDFS solutionDFS = new SolutionDFS();
        List<String> result = null;
        try {
            result = solutionDFS.letterCombinations(input);
            System.out.println(result);
            assertThat(result).hasSize(162);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void tensReverse(){
        int[] input = {23,3,4,5};
        SolutionDFS solutionDFS = new SolutionDFS();
        List<String> result = null;
        try {
            result = solutionDFS.letterCombinations(input);
            System.out.println(result);
            assertThat(result).hasSize(162);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
