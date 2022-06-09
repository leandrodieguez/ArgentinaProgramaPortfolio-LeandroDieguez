import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoArgproComponent } from './logo-argpro.component';

describe('LogoArgproComponent', () => {
  let component: LogoArgproComponent;
  let fixture: ComponentFixture<LogoArgproComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoArgproComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoArgproComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
