package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.Region;
import kr.co.fastcampus.eatgo.domain.RegionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;


class RegionServiceTests {


    private RegionService regionService;
    @Mock
    private RegionRepository regionRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        regionService = new RegionService(regionRepository);
    }

    @Test
    public void getRegions(){
        List<Region> MockRegions = new ArrayList<>();
        MockRegions.add(Region.builder().name("Seoul").build());

        given(regionRepository.findAll()).willReturn(MockRegions);
        List<Region> regions = regionService.getRegions();

        Region region = regions.get(0);
        assertThat(region.getName(), is("Seoul"));
    }

}